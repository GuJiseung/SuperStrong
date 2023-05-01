.class public final enum Lv4/v;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lv4/v;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lv4/v;

.field public static final enum d:Lv4/v;

.field public static final enum e:Lv4/v;

.field public static final enum f:Lv4/v;

.field public static final enum g:Lv4/v;

.field public static final enum h:Lv4/v;

.field public static final synthetic i:[Lv4/v;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    new-instance v0, Lv4/v;

    const-string v1, "http/1.0"

    const/4 v2, 0x0

    const-string v3, "HTTP_1_0"

    invoke-direct {v0, v2, v3, v1}, Lv4/v;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lv4/v;->c:Lv4/v;

    new-instance v1, Lv4/v;

    const-string v3, "http/1.1"

    const/4 v4, 0x1

    const-string v5, "HTTP_1_1"

    invoke-direct {v1, v4, v5, v3}, Lv4/v;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lv4/v;->d:Lv4/v;

    new-instance v3, Lv4/v;

    const-string v5, "spdy/3.1"

    const/4 v6, 0x2

    const-string v7, "SPDY_3"

    invoke-direct {v3, v6, v7, v5}, Lv4/v;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lv4/v;->e:Lv4/v;

    new-instance v5, Lv4/v;

    const-string v7, "h2"

    const/4 v8, 0x3

    const-string v9, "HTTP_2"

    invoke-direct {v5, v8, v9, v7}, Lv4/v;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sput-object v5, Lv4/v;->f:Lv4/v;

    new-instance v7, Lv4/v;

    const-string v9, "h2_prior_knowledge"

    const/4 v10, 0x4

    const-string v11, "H2_PRIOR_KNOWLEDGE"

    invoke-direct {v7, v10, v11, v9}, Lv4/v;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sput-object v7, Lv4/v;->g:Lv4/v;

    new-instance v9, Lv4/v;

    const-string v11, "quic"

    const/4 v12, 0x5

    const-string v13, "QUIC"

    invoke-direct {v9, v12, v13, v11}, Lv4/v;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sput-object v9, Lv4/v;->h:Lv4/v;

    const/4 v11, 0x6

    new-array v11, v11, [Lv4/v;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lv4/v;->i:[Lv4/v;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lv4/v;->b:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lv4/v;
    .locals 2

    const-string v0, "http/1.0"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lv4/v;->c:Lv4/v;

    return-object p0

    :cond_0
    const-string v0, "http/1.1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lv4/v;->d:Lv4/v;

    return-object p0

    :cond_1
    const-string v0, "h2_prior_knowledge"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lv4/v;->g:Lv4/v;

    return-object p0

    :cond_2
    const-string v0, "h2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lv4/v;->f:Lv4/v;

    return-object p0

    :cond_3
    const-string v0, "spdy/3.1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, Lv4/v;->e:Lv4/v;

    return-object p0

    :cond_4
    const-string v0, "quic"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, Lv4/v;->h:Lv4/v;

    return-object p0

    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unexpected protocol: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lv4/v;
    .locals 1

    const-class v0, Lv4/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lv4/v;

    return-object p0
.end method

.method public static values()[Lv4/v;
    .locals 1

    sget-object v0, Lv4/v;->i:[Lv4/v;

    invoke-virtual {v0}, [Lv4/v;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv4/v;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv4/v;->b:Ljava/lang/String;

    return-object v0
.end method
