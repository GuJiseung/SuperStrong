.class public final Lt3/s$a;
.super Lq3/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt3/s;->a(Lq3/j;Lw3/a;)Lq3/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lq3/x<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/Class;

.field public final synthetic b:Lt3/s;


# direct methods
.method public constructor <init>(Lt3/s;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lt3/s$a;->b:Lt3/s;

    iput-object p2, p0, Lt3/s$a;->a:Ljava/lang/Class;

    invoke-direct {p0}, Lq3/x;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lx3/a;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx3/a;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lt3/s$a;->b:Lt3/s;

    iget-object v0, v0, Lt3/s;->c:Lq3/x;

    invoke-virtual {v0, p1}, Lq3/x;->a(Lx3/a;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lt3/s$a;->a:Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lq3/u;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected a "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " but was "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lq3/u;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    return-object p1
.end method

.method public final b(Lx3/c;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx3/c;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lt3/s$a;->b:Lt3/s;

    iget-object v0, v0, Lt3/s;->c:Lq3/x;

    invoke-virtual {v0, p1, p2}, Lq3/x;->b(Lx3/c;Ljava/lang/Object;)V

    return-void
.end method
