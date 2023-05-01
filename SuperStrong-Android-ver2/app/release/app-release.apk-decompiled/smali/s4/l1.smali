.class public final Ls4/l1;
.super Lkotlinx/coroutines/internal/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/internal/o<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final e:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lc4/c<",
            "Le4/f;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le4/d;Le4/f;)V
    .locals 2

    sget-object v0, Ls4/m1;->b:Ls4/m1;

    invoke-interface {p2, v0}, Le4/f;->get(Le4/f$c;)Le4/f$b;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-interface {p2, v0}, Le4/f;->plus(Le4/f;)Le4/f;

    move-result-object p2

    :cond_0
    invoke-direct {p0, p1, p2}, Lkotlinx/coroutines/internal/o;-><init>(Le4/d;Le4/f;)V

    new-instance p1, Ljava/lang/ThreadLocal;

    invoke-direct {p1}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object p1, p0, Ls4/l1;->e:Ljava/lang/ThreadLocal;

    return-void
.end method


# virtual methods
.method public final V(Ljava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Ls4/l1;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc4/c;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, v1, Lc4/c;->b:Ljava/lang/Object;

    check-cast v3, Le4/f;

    iget-object v1, v1, Lc4/c;->c:Ljava/lang/Object;

    invoke-static {v3, v1}, Lkotlinx/coroutines/internal/q;->a(Le4/f;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :goto_0
    invoke-static {p1}, Lkotlinx/coroutines/internal/f;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lkotlinx/coroutines/internal/o;->d:Le4/d;

    invoke-interface {v0}, Le4/d;->b()Le4/f;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlinx/coroutines/internal/q;->b(Le4/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lkotlinx/coroutines/internal/q;->a:La1/r;

    if-eq v3, v4, :cond_1

    invoke-static {v0, v1, v3}, Ls4/r;->b(Le4/d;Le4/f;Ljava/lang/Object;)Ls4/l1;

    move-result-object v2

    :cond_1
    :try_start_0
    invoke-interface {v0, p1}, Le4/d;->d(Ljava/lang/Object;)V

    sget-object p1, Lc4/h;->a:Lc4/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ls4/l1;->X()Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    invoke-static {v1, v3}, Lkotlinx/coroutines/internal/q;->a(Le4/f;Ljava/lang/Object;)V

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ls4/l1;->X()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    invoke-static {v1, v3}, Lkotlinx/coroutines/internal/q;->a(Le4/f;Ljava/lang/Object;)V

    :cond_5
    throw p1
.end method

.method public final X()Z
    .locals 2

    iget-object v0, p0, Ls4/l1;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 v0, 0x1

    return v0
.end method
