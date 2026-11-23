package j.d.e.k.b;

/* JADX INFO: loaded from: classes.dex */
final class m extends c {
    m() {
    }

    @Override // j.d.e.k.b.c
    int c(char c, StringBuilder sb) {
        int i2;
        int i3;
        char c2;
        if (c == ' ') {
            c2 = 3;
        } else {
            if (c >= '0' && c <= '9') {
                i3 = (c - '0') + 4;
            } else {
                if (c < 'a' || c > 'z') {
                    if (c < ' ') {
                        sb.append((char) 0);
                    } else {
                        char c3 = '!';
                        if (c < '!' || c > '/') {
                            if (c >= ':' && c <= '@') {
                                sb.append((char) 1);
                                i2 = (c - ':') + 15;
                            } else if (c < '[' || c > '_') {
                                c3 = '`';
                                if (c == '`') {
                                    sb.append((char) 2);
                                } else if (c >= 'A' && c <= 'Z') {
                                    sb.append((char) 2);
                                    i2 = (c - 'A') + 1;
                                } else {
                                    if (c < '{' || c > 127) {
                                        sb.append("\u0001\u001e");
                                        return c((char) (c - 128), sb) + 2;
                                    }
                                    sb.append((char) 2);
                                    i2 = (c - '{') + 27;
                                }
                            } else {
                                sb.append((char) 1);
                                i2 = (c - '[') + 22;
                            }
                            c = (char) i2;
                        } else {
                            sb.append((char) 1);
                        }
                        i2 = c - c3;
                        c = (char) i2;
                    }
                    sb.append(c);
                    return 2;
                }
                i3 = (c - 'a') + 14;
            }
            c2 = (char) i3;
        }
        sb.append(c2);
        return 1;
    }

    @Override // j.d.e.k.b.c
    public int e() {
        return 2;
    }
}
