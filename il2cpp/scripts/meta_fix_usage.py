import struct
p=r'C:\Users\runneradmin\Downloads\ok\decompiled\il2cpp\global-metadata.decrypted.dat'
d=open(p,'rb').read()
U=lambda o: struct.unpack_from('<I',d,o)[0]
LS=0x1957048;LN=98259
PS=0x1A16EE0;PN=438004
sm=0
for k in range(LN): sm+=U(LS+k*8+4)
print('list sum',sm,hex(sm),'pairs',PN,hex(PN),'end',hex(PS+PN*8))
mx=0;types=set()
for k in range(PN):
    dst=U(PS+k*8);enc=U(PS+k*8+4)
    if dst>mx:mx=dst
    types.add((enc&0xE0000000)>>29)
print('max dst',mx,hex(mx),'count',mx+1,'types',sorted(types))
print('hex counts',hex(LN),hex(PN))
