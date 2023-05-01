.class public final enum Lv4/f0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lv4/f0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lv4/f0;

.field public static final enum d:Lv4/f0;

.field public static final enum e:Lv4/f0;

.field public static final enum f:Lv4/f0;

.field public static final enum g:Lv4/f0;

.field public static final synthetic h:[Lv4/f0;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    new-instance v0, Lv4/f0;

    const-string v1, "TLSv1.3"

    const/4 v2, 0x0

    const-string v3, "TLS_1_3"

    invoke-direct {v0, v2, v3, v1}, Lv4/f0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lv4/f0;->c:Lv4/f0;

    new-instance v1, Lv4/f0;

    const-string v3, "TLSv1.2"

    const/4 v4, 0x1

    const-string v5, "TLS_1_2"

    invoke-direct {v1, v4, v5, v3}, Lv4/f0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lv4/f0;->d:Lv4/f0;

    new-instance v3, Lv4/f0;

    const-string v5, "TLSv1.1"

    const/4 v6, 0x2

    const-string v7, "TLS_1_1"

    invoke-direct {v3, v6, v7, v5}, Lv4/f0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lv4/f0;->e:Lv4/f0;

    new-instance v5, Lv4/f0;

    const-string v7, "TLSv1"

    const/4 v8, 0x3

    const-string v9, "TLS_1_0"

    invoke-direct {v5, v8, v9, v7}, Lv4/f0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sput-object v5, Lv4/f0;->f:Lv4/f0;

    new-instance v7, Lv4/f0;

    const-string v9, "SSLv3"

    const/4 v10, 0x4

    const-string v11, "SSL_3_0"

    invoke-direct {v7, v10, v11, v9}, Lv4/f0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sput-object v7, Lv4/f0;->g:Lv4/f0;

    const/4 v9, 0x5

    new-array v9, v9, [Lv4/f0;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lv4/f0;->h:[Lv4/f0;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lv4/f0;->b:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lv4/f0;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "TLSv1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_1
    const-string v0, "SSLv3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_2
    const-string v0, "TLSv1.3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_3
    const-string v0, "TLSv1.2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_4
    const-string v0, "TLSv1.1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unexpected TLS version: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object p0, Lv4/f0;->f:Lv4/f0;

    return-object p0

    :pswitch_1
    sget-object p0, Lv4/f0;->g:Lv4/f0;

    return-object p0

    :pswitch_2
    sget-object p0, Lv4/f0;->c:Lv4/f0;

    return-object p0

    :pswitch_3
    sget-object p0, Lv4/f0;->d:Lv4/f0;

    return-object p0

    :pswitch_4
    sget-object p0, Lv4/f0;->e:Lv4/f0;

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x1dfc3f27 -> :sswitch_4
        -0x1dfc3f26 -> :sswitch_3
        -0x1dfc3f25 -> :sswitch_2
        0x4b88569 -> :sswitch_1
        0x4c38896 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lv4/f0;
    .locals 1

    const-class v0, Lv4/f0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lv4/f0;

    return-object p0
.end method

.method public static values()[Lv4/f0;
    .locals 1

    sget-object v0, Lv4/f0;->h:[Lv4/f0;

    invoke-virtual {v0}, [Lv4/f0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv4/f0;

    return-object v0
.end method
