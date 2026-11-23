.class public final Lm/h0/k/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:Ln/e;

.field public static final e:Ln/e;

.field public static final f:Ln/e;

.field public static final g:Ln/e;

.field public static final h:Ln/e;

.field public static final i:Ln/e;


# instance fields
.field public final a:Ln/e;

.field public final b:Ln/e;

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ln/e;->d:Ln/e$a;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ln/e$a;->d(Ljava/lang/String;)Ln/e;

    move-result-object v1

    sput-object v1, Lm/h0/k/c;->d:Ln/e;

    const-string v1, ":status"

    invoke-virtual {v0, v1}, Ln/e$a;->d(Ljava/lang/String;)Ln/e;

    move-result-object v1

    sput-object v1, Lm/h0/k/c;->e:Ln/e;

    const-string v1, ":method"

    invoke-virtual {v0, v1}, Ln/e$a;->d(Ljava/lang/String;)Ln/e;

    move-result-object v1

    sput-object v1, Lm/h0/k/c;->f:Ln/e;

    const-string v1, ":path"

    invoke-virtual {v0, v1}, Ln/e$a;->d(Ljava/lang/String;)Ln/e;

    move-result-object v1

    sput-object v1, Lm/h0/k/c;->g:Ln/e;

    const-string v1, ":scheme"

    invoke-virtual {v0, v1}, Ln/e$a;->d(Ljava/lang/String;)Ln/e;

    move-result-object v1

    sput-object v1, Lm/h0/k/c;->h:Ln/e;

    const-string v1, ":authority"

    invoke-virtual {v0, v1}, Ln/e$a;->d(Ljava/lang/String;)Ln/e;

    move-result-object v0

    sput-object v0, Lm/h0/k/c;->i:Ln/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ln/e;->d:Ln/e$a;

    invoke-virtual {v0, p1}, Ln/e$a;->d(Ljava/lang/String;)Ln/e;

    move-result-object p1

    invoke-virtual {v0, p2}, Ln/e$a;->d(Ljava/lang/String;)Ln/e;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lm/h0/k/c;-><init>(Ln/e;Ln/e;)V

    return-void
.end method

.method public constructor <init>(Ln/e;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ln/e;->d:Ln/e$a;

    invoke-virtual {v0, p2}, Ln/e$a;->d(Ljava/lang/String;)Ln/e;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lm/h0/k/c;-><init>(Ln/e;Ln/e;)V

    return-void
.end method

.method public constructor <init>(Ln/e;Ln/e;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/h0/k/c;->a:Ln/e;

    iput-object p2, p0, Lm/h0/k/c;->b:Ln/e;

    invoke-virtual {p1}, Ln/e;->t()I

    move-result p1

    add-int/lit8 p1, p1, 0x20

    invoke-virtual {p2}, Ln/e;->t()I

    move-result p2

    add-int/2addr p1, p2

    iput p1, p0, Lm/h0/k/c;->c:I

    return-void
.end method


# virtual methods
.method public final a()Ln/e;
    .locals 1

    iget-object v0, p0, Lm/h0/k/c;->a:Ln/e;

    return-object v0
.end method

.method public final b()Ln/e;
    .locals 1

    iget-object v0, p0, Lm/h0/k/c;->b:Ln/e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm/h0/k/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lm/h0/k/c;

    iget-object v1, p0, Lm/h0/k/c;->a:Ln/e;

    iget-object v3, p1, Lm/h0/k/c;->a:Ln/e;

    invoke-static {v1, v3}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lm/h0/k/c;->b:Ln/e;

    iget-object p1, p1, Lm/h0/k/c;->b:Ln/e;

    invoke-static {v1, p1}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lm/h0/k/c;->a:Ln/e;

    invoke-virtual {v0}, Ln/e;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm/h0/k/c;->b:Ln/e;

    invoke-virtual {v1}, Ln/e;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lm/h0/k/c;->a:Ln/e;

    invoke-virtual {v1}, Ln/e;->x()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm/h0/k/c;->b:Ln/e;

    invoke-virtual {v1}, Ln/e;->x()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
