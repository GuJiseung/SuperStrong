.class public final Lq3/q;
.super Lq3/n;
.source "SourceFile"


# instance fields
.field public final b:Ls3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/m<",
            "Ljava/lang/String;",
            "Lq3/n;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lq3/n;-><init>()V

    new-instance v0, Ls3/m;

    invoke-direct {v0}, Ls3/m;-><init>()V

    iput-object v0, p0, Lq3/q;->b:Ls3/m;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;)Lq3/n;
    .locals 1

    iget-object v0, p0, Lq3/q;->b:Ls3/m;

    invoke-virtual {v0, p1}, Ls3/m;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq3/n;

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    instance-of v0, p1, Lq3/q;

    if-eqz v0, :cond_0

    check-cast p1, Lq3/q;

    iget-object p1, p1, Lq3/q;->b:Ls3/m;

    iget-object v0, p0, Lq3/q;->b:Ls3/m;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lq3/q;->b:Ls3/m;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
