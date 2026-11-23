import struct,shutil,os
exec(open(r'C:\Users\runneradmin\AppData\Local\Temp\2\opencode\xapk_inspect\elf_regs.py').read().split("dump('CodeRegistration'")[0])
src=r'C:\Users\runneradmin\Downloads\ok\decompiled\il2cpp\input\libil2cpp.so'
dst=r'C:\Users\runneradmin\Downloads\ok\decompiled\il2cpp\input\libil2cpp.patched3.so'
shutil.copyfile(src,dst)
d=bytearray(open(dst,'rb').read())
KEY=0xF7F7F7F7
def dec(v):
    return v^KEY

def patch_triples(name,va,count):
    n=0
    for i in range(count):
        for j in range(0,12,4):
            p=va+i*12+j
            v=struct.unpack_from('<I',d,p)[0]
            if (v>>24)==0xF7 or v==0x08080808:
                struct.pack_into('<I',d,p,dec(v));n+=1
    print(name,n)

patch_triples('genericMethodTable',0x5AE1090,0x150A2)
patch_triples('methodSpecs',0x59DEA1C,0x156F9)

p=v2o(0x6BCCFC0);N=0x20B05
seen=set();n=0
for i in range(N):
    ptr=u64(p+i*8);q=v2o(ptr)
    if q is None or q in seen: continue
    seen.add(q)
    ws=[u32(q+j*4) for j in range(4)]
    if ws[1]==0xF7F7F7F7 and (ws[0]>>24)==0xF7 and ws[3]==0xF7F7F7F7:
        for j in range(4):
            struct.pack_into('<I',d,q+j*4,dec(ws[j]))
        n+=1
print('Il2CppType objects decrypted',n,'unique',len(seen))
open(dst,'wb').write(d)
print('wrote',dst,os.path.getsize(dst))
