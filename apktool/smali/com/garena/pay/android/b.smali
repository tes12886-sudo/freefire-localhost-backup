.class public final enum Lcom/garena/pay/android/b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/garena/pay/android/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum F:Lcom/garena/pay/android/b;

.field public static final enum G:Lcom/garena/pay/android/b;

.field public static final enum H:Lcom/garena/pay/android/b;

.field public static final enum I:Lcom/garena/pay/android/b;

.field public static final enum J:Lcom/garena/pay/android/b;

.field public static final enum K:Lcom/garena/pay/android/b;

.field public static final enum L:Lcom/garena/pay/android/b;

.field public static final enum M:Lcom/garena/pay/android/b;

.field public static final enum N:Lcom/garena/pay/android/b;

.field public static final enum O:Lcom/garena/pay/android/b;

.field public static final enum P:Lcom/garena/pay/android/b;

.field public static final enum Q:Lcom/garena/pay/android/b;

.field public static final enum R:Lcom/garena/pay/android/b;

.field public static final enum S:Lcom/garena/pay/android/b;

.field public static final enum T:Lcom/garena/pay/android/b;

.field public static final enum U:Lcom/garena/pay/android/b;

.field public static final enum V:Lcom/garena/pay/android/b;

.field public static final enum W:Lcom/garena/pay/android/b;

.field public static final enum X:Lcom/garena/pay/android/b;

.field public static final enum Y:Lcom/garena/pay/android/b;

.field public static final enum Z:Lcom/garena/pay/android/b;

.field public static final enum a0:Lcom/garena/pay/android/b;

.field public static final enum b0:Lcom/garena/pay/android/b;

.field public static final enum c:Lcom/garena/pay/android/b;

.field public static final enum c0:Lcom/garena/pay/android/b;

.field public static final enum d:Lcom/garena/pay/android/b;

.field public static final enum d0:Lcom/garena/pay/android/b;

.field public static final enum e:Lcom/garena/pay/android/b;

.field public static final enum e0:Lcom/garena/pay/android/b;

.field public static final enum f:Lcom/garena/pay/android/b;

.field public static final enum f0:Lcom/garena/pay/android/b;

.field public static final enum g:Lcom/garena/pay/android/b;

.field public static final enum g0:Lcom/garena/pay/android/b;

.field public static final enum h:Lcom/garena/pay/android/b;

.field public static final enum h0:Lcom/garena/pay/android/b;

.field public static final enum i:Lcom/garena/pay/android/b;

.field private static final synthetic i0:[Lcom/garena/pay/android/b;

.field public static final enum j:Lcom/garena/pay/android/b;

.field public static final enum k:Lcom/garena/pay/android/b;

.field public static final enum l:Lcom/garena/pay/android/b;

.field public static final enum m:Lcom/garena/pay/android/b;

.field public static final enum n:Lcom/garena/pay/android/b;

.field public static final enum o:Lcom/garena/pay/android/b;

.field public static final enum p:Lcom/garena/pay/android/b;

.field public static final enum q:Lcom/garena/pay/android/b;

.field public static final enum r:Lcom/garena/pay/android/b;

.field public static final enum s:Lcom/garena/pay/android/b;

.field public static final enum t:Lcom/garena/pay/android/b;

.field public static final enum u:Lcom/garena/pay/android/b;

.field public static final enum v:Lcom/garena/pay/android/b;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/garena/pay/android/b;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "SUCCESS"

    const-string v4, "No Error"

    invoke-direct {v0, v3, v1, v2, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->c:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7d0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "APP_NOT_INSTALLED"

    const/4 v3, 0x1

    const-string v4, "Application is not installed"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->d:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7d1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "UNSUPPORTED_API"

    const/4 v3, 0x2

    const-string v4, "Unsupported API used"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->e:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7d2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "USER_CANCELLED"

    const/4 v3, 0x3

    const-string v4, "User cancelled the request"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->f:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7d3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "USER_DENIED_REQUEST"

    const/4 v3, 0x4

    const-string v4, "User denied the request"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->g:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7d4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "LOGIN_FAILED"

    const/4 v3, 0x5

    const-string v4, "Login failed"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->h:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7d5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "REFRESH_TOKEN_SUCCESS"

    const/4 v3, 0x6

    const-string v4, "Token refreshed successfully"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->i:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7d6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "REFRESH_TOKEN_FAILED"

    const/4 v3, 0x7

    const-string v4, "Token refreshed failed"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->j:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7d7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ACCESS_TOKEN_EXPIRED"

    const/16 v3, 0x8

    const-string v4, "Access token expired"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->k:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7d8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "NETWORK_EXCEPTION"

    const/16 v3, 0x9

    const-string v4, "Network error."

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->l:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7d9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ACCESS_TOKEN_EXCHANGE_FAILED"

    const/16 v3, 0xa

    const-string v4, "Access token exchanged failed"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->m:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7da

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "NETWORK_CONNECTION_EXCEPTION"

    const/16 v3, 0xb

    const-string v4, "Server cannot be reached. Check your network connection"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->n:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7db

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "CANNOT_GET_RESULT"

    const/16 v3, 0xc

    const-string v4, "Unable to retrieve result"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->o:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7dc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ERROR_IN_PARAMS"

    const/16 v3, 0xd

    const-string v4, "Error in parameters"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->p:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7dd

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "CANNOT_START_ACTIVITY"

    const/16 v3, 0xe

    const-string v4, "Cannot start activity"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->q:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7de

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "REQUEST_ID_MISMATCH"

    const/16 v3, 0xf

    const-string v4, "Request ID mismatch"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->r:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7df

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ACCESS_TOKEN_INSPECTION_FAILED"

    const/16 v3, 0x10

    const-string v5, "Token inspection failed"

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->s:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7e0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "SESSION_NOT_INITIALIZED"

    const/16 v3, 0x11

    const-string v5, "Session not initialized"

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->t:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x836

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "BATCH_SIZE_EXCEEDED"

    const/16 v3, 0x12

    const-string v5, "Batch size exceeded for the request"

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->u:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x899

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "BIND_FAILED"

    const/16 v3, 0x13

    const-string v5, "Bind failed but login success"

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->v:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x89a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "GUEST_ACCOUNT_INVALID"

    const/16 v3, 0x14

    const-string v5, "Fail to grant guest token"

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->F:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x900

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "REDEEM_NOT_AVAILABLE"

    const/16 v3, 0x15

    const-string v5, "Redeem not available"

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->G:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x901

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ALREADY_REDEEMED"

    const/16 v3, 0x16

    const-string v5, "Already redeemed"

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->H:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x902

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "REDEEM_LIMIT_REACHED"

    const/16 v3, 0x17

    const-string v5, "Redeem limit reached"

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->I:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x903

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ERROR_TOKEN_SESSION"

    const/16 v3, 0x18

    const-string v5, "Error token session"

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->J:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x904

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "NETWORK_RESPONSE_PARSE_FAIL"

    const/16 v3, 0x19

    const-string v5, "Network response parse failed"

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->K:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x905

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "NETWORK_REQUEST_TIME_OUT"

    const/16 v3, 0x1a

    const-string v5, "Network request timeout"

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->L:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x8fc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "GOP_ERROR_SERVER"

    const/16 v3, 0x1b

    const-string v5, "Server error"

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->M:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x8fe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "GOP_ERROR_TOKEN"

    const/16 v3, 0x1c

    const-string v5, "Invalid token"

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->N:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x8ff

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "GOP_ERROR_SCOPE"

    const/16 v3, 0x1d

    const-string v5, "Invalid scope"

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->O:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0xbb7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ERROR"

    const/16 v3, 0x1e

    const-string v5, "General error"

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->P:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x1b58

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "PAYMENT_NO_ERROR"

    const/16 v3, 0x1f

    const-string v5, "No payment error"

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->Q:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x1b59

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "PAYMENT_CANNOT_START_ACTIVITY"

    const/16 v3, 0x20

    const-string v5, "Cannot start payment activity"

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->R:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x1b5a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "PAYMENT_REQUEST_ID_MISMATCH"

    const/16 v3, 0x21

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->S:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x1b5b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "PAYMENT_USER_CANCELLED"

    const/16 v3, 0x22

    const-string v4, "User cancelled payment"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->T:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x1b5c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "PAYMENT_INVALID_SERVER_RESPONSE"

    const/16 v3, 0x23

    const-string v4, "Payment recd. Invalid response from server"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->U:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x1b5d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "PAYMENT_NETWORK_CONNECTION_EXCEPTION"

    const/16 v3, 0x24

    const-string v4, "Network connection exception with the server"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->V:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x1b5e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "PAYMENT_BUNDLE_RESULT_INVALID"

    const/16 v3, 0x25

    const-string v4, "Bundle result cannot be read, did you call onActivityResult?"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->W:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x1b5f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "PAYMENT_ERROR_IN_PARAMS"

    const/16 v3, 0x26

    const-string v4, "Invalid parameters"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->X:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x1b60

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "PAYMENT_ERROR_IN_SCOPE"

    const/16 v3, 0x27

    const-string v4, "Scope does not authorize payment"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->Y:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x1b61

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "PAYMENT_ERROR_IN_TOKEN"

    const/16 v3, 0x28

    const-string v4, "Error in access token used for payment"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->Z:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x1b62

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "PAYMENT_ERROR_SUBSCRIPTION_BINDING"

    const/16 v3, 0x29

    const-string v4, "Error when server binding subscription"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->a0:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x1b63

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "PAYMENT_ERROR_PENDING_TRANSACTION"

    const/16 v3, 0x2a

    const-string v4, "Pending transaction"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->b0:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x1f3f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "PAYMENT_GENERAL_ERROR"

    const/16 v3, 0x2b

    const-string v4, "General payment error"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->c0:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "UNKNOWN_ERROR"

    const/16 v3, 0x2c

    const-string v4, "Unknown error occurred"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7e1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ACCESS_TOKEN_INVALID_GRANT"

    const/16 v3, 0x2d

    const-string v4, "Access token invalid grant"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->e0:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7e2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ERROR_USER_BANNED"

    const/16 v3, 0x2e

    const-string v4, "User banned"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->f0:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x7e3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ERROR_GUEST_LOGIN"

    const/16 v3, 0x2f

    const-string v4, "Error guest login"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->g0:Lcom/garena/pay/android/b;

    new-instance v0, Lcom/garena/pay/android/b;

    const/16 v1, 0x4e20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "DECODE_IMAGE_FAILED"

    const/16 v3, 0x30

    const-string v4, "Failed to decode image"

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/garena/pay/android/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V

    sput-object v0, Lcom/garena/pay/android/b;->h0:Lcom/garena/pay/android/b;

    invoke-static {}, Lcom/garena/pay/android/b;->a()[Lcom/garena/pay/android/b;

    move-result-object v0

    sput-object v0, Lcom/garena/pay/android/b;->i0:[Lcom/garena/pay/android/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p4, p0, Lcom/garena/pay/android/b;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/garena/pay/android/b;->b:Ljava/lang/Integer;

    return-void
.end method

.method private static synthetic a()[Lcom/garena/pay/android/b;
    .locals 3

    const/16 v0, 0x31

    new-array v0, v0, [Lcom/garena/pay/android/b;

    sget-object v1, Lcom/garena/pay/android/b;->c:Lcom/garena/pay/android/b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->d:Lcom/garena/pay/android/b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->e:Lcom/garena/pay/android/b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->f:Lcom/garena/pay/android/b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->g:Lcom/garena/pay/android/b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->h:Lcom/garena/pay/android/b;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->i:Lcom/garena/pay/android/b;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->j:Lcom/garena/pay/android/b;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->k:Lcom/garena/pay/android/b;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->l:Lcom/garena/pay/android/b;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->m:Lcom/garena/pay/android/b;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->n:Lcom/garena/pay/android/b;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->o:Lcom/garena/pay/android/b;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->p:Lcom/garena/pay/android/b;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->q:Lcom/garena/pay/android/b;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->r:Lcom/garena/pay/android/b;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->s:Lcom/garena/pay/android/b;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->t:Lcom/garena/pay/android/b;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->u:Lcom/garena/pay/android/b;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->v:Lcom/garena/pay/android/b;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->F:Lcom/garena/pay/android/b;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->G:Lcom/garena/pay/android/b;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->H:Lcom/garena/pay/android/b;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->I:Lcom/garena/pay/android/b;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->J:Lcom/garena/pay/android/b;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->K:Lcom/garena/pay/android/b;

    const/16 v2, 0x19

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->L:Lcom/garena/pay/android/b;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->M:Lcom/garena/pay/android/b;

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->N:Lcom/garena/pay/android/b;

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->O:Lcom/garena/pay/android/b;

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->P:Lcom/garena/pay/android/b;

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->Q:Lcom/garena/pay/android/b;

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->R:Lcom/garena/pay/android/b;

    const/16 v2, 0x20

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->S:Lcom/garena/pay/android/b;

    const/16 v2, 0x21

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->T:Lcom/garena/pay/android/b;

    const/16 v2, 0x22

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->U:Lcom/garena/pay/android/b;

    const/16 v2, 0x23

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->V:Lcom/garena/pay/android/b;

    const/16 v2, 0x24

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->W:Lcom/garena/pay/android/b;

    const/16 v2, 0x25

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->X:Lcom/garena/pay/android/b;

    const/16 v2, 0x26

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->Y:Lcom/garena/pay/android/b;

    const/16 v2, 0x27

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->Z:Lcom/garena/pay/android/b;

    const/16 v2, 0x28

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->a0:Lcom/garena/pay/android/b;

    const/16 v2, 0x29

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->b0:Lcom/garena/pay/android/b;

    const/16 v2, 0x2a

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->c0:Lcom/garena/pay/android/b;

    const/16 v2, 0x2b

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    const/16 v2, 0x2c

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->e0:Lcom/garena/pay/android/b;

    const/16 v2, 0x2d

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->f0:Lcom/garena/pay/android/b;

    const/16 v2, 0x2e

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->g0:Lcom/garena/pay/android/b;

    const/16 v2, 0x2f

    aput-object v1, v0, v2

    sget-object v1, Lcom/garena/pay/android/b;->h0:Lcom/garena/pay/android/b;

    const/16 v2, 0x30

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static d(I)Lcom/garena/pay/android/b;
    .locals 5

    invoke-static {}, Lcom/garena/pay/android/b;->values()[Lcom/garena/pay/android/b;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne p0, v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object p0, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    return-object p0
.end method

.method public static f(I)Z
    .locals 1

    sget-object v0, Lcom/garena/pay/android/b;->m:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/garena/pay/android/b;->k:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/garena/pay/android/b;->j:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/garena/pay/android/b;
    .locals 1

    const-class v0, Lcom/garena/pay/android/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/garena/pay/android/b;

    return-object p0
.end method

.method public static values()[Lcom/garena/pay/android/b;
    .locals 1

    sget-object v0, Lcom/garena/pay/android/b;->i0:[Lcom/garena/pay/android/b;

    invoke-virtual {v0}, [Lcom/garena/pay/android/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/garena/pay/android/b;

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/b;->b:Ljava/lang/Integer;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/b;->a:Ljava/lang/String;

    return-object v0
.end method
