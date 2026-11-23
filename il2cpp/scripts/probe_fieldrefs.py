import struct
p=r'C:\Users\runneradmin\Downloads\ok\decompiled\il2cpp\global-metadata.reconstructed.dat'
d=open(p,'rb').read()
U=lambda o:struct.unpack_from('<I',d,o)[0]
# read header values directly
LS=U(48*4); LN=U(49*4)//8
PS=U(50*4); PN=U(51*4)//8
FS=U(52*4); FLEN=U(53*4)//8
print('lists',hex(LS),LN,'pairs',hex(PS),PN,'fieldRefs',hex(FS),FLEN)
mx=0; n=0; top=[]
for k in range(LN):
    st=U(LS+k*8);c=U(LS+k*8+4)
    for j in range(c):
        off=st+j
        if off>=PN: continue
        enc=U(PS+off*8+4)
        if (enc>>29)==4:
            idx=enc&0x1FFFFFFF
            n+=1
            if idx>mx:mx=idx
            if len(top)<10 or idx>top[0][0]:
                top.append((idx,k,off)); top=sorted(top)[-10:]
print('field usage n',n,'max index',mx,hex(mx),'top',top[-5:])
