.class public final Lt3/j$a;
.super Lq3/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt3/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lq3/x<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Ls3/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/n<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lt3/j$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ls3/n;Ljava/util/LinkedHashMap;)V
    .locals 0

    invoke-direct {p0}, Lq3/x;-><init>()V

    iput-object p1, p0, Lt3/j$a;->a:Ls3/n;

    iput-object p2, p0, Lt3/j$a;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Lx3/a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx3/a;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Lx3/a;->M()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lx3/a;->I()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lt3/j$a;->a:Ls3/n;

    invoke-interface {v0}, Ls3/n;->e()Ljava/lang/Object;

    move-result-object v0

    :try_start_0
    invoke-virtual {p1}, Lx3/a;->f()V

    :goto_0
    invoke-virtual {p1}, Lx3/a;->q()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lx3/a;->G()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lt3/j$a;->b:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt3/j$b;

    if-eqz v1, :cond_2

    iget-boolean v2, v1, Lt3/j$b;->c:Z

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1, p1, v0}, Lt3/j$b;->a(Lx3/a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {p1}, Lx3/a;->R()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lx3/a;->n()V

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :catch_1
    move-exception p1

    new-instance v0, Lq3/u;

    invoke-direct {v0, p1}, Lq3/u;-><init>(Ljava/lang/Exception;)V

    throw v0
.end method

.method public final b(Lx3/c;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx3/c;",
            "TT;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lx3/c;->q()Lx3/c;

    return-void

    :cond_0
    invoke-virtual {p1}, Lx3/c;->h()V

    :try_start_0
    iget-object v0, p0, Lt3/j$a;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt3/j$b;

    invoke-virtual {v1, p2}, Lt3/j$b;->c(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v1, Lt3/j$b;->a:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lx3/c;->o(Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Lt3/j$b;->b(Lx3/c;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lx3/c;->n()V

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2
.end method
