.class public abstract Ls4/g0;
.super Lkotlinx/coroutines/scheduling/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/scheduling/g;"
    }
.end annotation


# instance fields
.field public d:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/g;-><init>()V

    iput p1, p0, Ls4/g0;->d:I

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V
    .locals 0

    return-void
.end method

.method public abstract e()Le4/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le4/d<",
            "TT;>;"
        }
    .end annotation
.end method

.method public f(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    instance-of v0, p1, Ls4/n;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ls4/n;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p1, Ls4/n;->a:Ljava/lang/Throwable;

    :goto_1
    return-object v1
.end method

.method public g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    return-object p1
.end method

.method public final h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    invoke-static {p1, p2}, Landroidx/activity/k;->f(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    if-nez p1, :cond_2

    move-object p1, p2

    :cond_2
    new-instance p2, Ls4/x;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fatal exception in coroutines machinery for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ll4/f;->c(Ljava/lang/Object;)V

    invoke-direct {p2, v0, p1}, Ls4/x;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Ls4/g0;->e()Le4/d;

    move-result-object p1

    invoke-interface {p1}, Le4/d;->b()Le4/f;

    move-result-object p1

    invoke-static {p1, p2}, Lc0/n;->f(Le4/f;Ljava/lang/Throwable;)V

    return-void
.end method

.method public abstract i()Ljava/lang/Object;
.end method

.method public final run()V
    .locals 12

    iget-object v0, p0, Lkotlinx/coroutines/scheduling/g;->c:Lkotlinx/coroutines/scheduling/h;

    :try_start_0
    invoke-virtual {p0}, Ls4/g0;->e()Le4/d;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/internal/c;

    iget-object v2, v1, Lkotlinx/coroutines/internal/c;->f:Le4/d;

    iget-object v1, v1, Lkotlinx/coroutines/internal/c;->h:Ljava/lang/Object;

    invoke-interface {v2}, Le4/d;->b()Le4/f;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlinx/coroutines/internal/q;->b(Le4/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Lkotlinx/coroutines/internal/q;->a:La1/r;

    const/4 v5, 0x0

    if-eq v1, v4, :cond_0

    invoke-static {v2, v3, v1}, Ls4/r;->b(Le4/d;Le4/f;Ljava/lang/Object;)Ls4/l1;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    :try_start_1
    invoke-interface {v2}, Le4/d;->b()Le4/f;

    move-result-object v6

    invoke-virtual {p0}, Ls4/g0;->i()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p0, v7}, Ls4/g0;->f(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v8

    if-nez v8, :cond_3

    iget v9, p0, Ls4/g0;->d:I

    const/4 v10, 0x1

    if-eq v9, v10, :cond_2

    const/4 v11, 0x2

    if-ne v9, v11, :cond_1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    :cond_2
    :goto_1
    if-eqz v10, :cond_3

    sget-object v9, Ls4/u0$b;->b:Ls4/u0$b;

    invoke-interface {v6, v9}, Le4/f;->get(Le4/f$c;)Le4/f$b;

    move-result-object v6

    check-cast v6, Ls4/u0;

    goto :goto_2

    :cond_3
    move-object v6, v5

    :goto_2
    if-eqz v6, :cond_4

    invoke-interface {v6}, Ls4/u0;->c()Z

    move-result v9

    if-nez v9, :cond_4

    invoke-interface {v6}, Ls4/u0;->s()Ljava/util/concurrent/CancellationException;

    move-result-object v6

    invoke-virtual {p0, v7, v6}, Ls4/g0;->c(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V

    invoke-static {v6}, La1/f0;->e(Ljava/lang/Throwable;)Lc4/d$a;

    move-result-object v6

    goto :goto_3

    :catchall_0
    move-exception v2

    goto :goto_5

    :cond_4
    if-eqz v8, :cond_5

    invoke-static {v8}, La1/f0;->e(Ljava/lang/Throwable;)Lc4/d$a;

    move-result-object v6

    goto :goto_3

    :cond_5
    invoke-virtual {p0, v7}, Ls4/g0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    :goto_3
    invoke-interface {v2, v6}, Le4/d;->d(Ljava/lang/Object;)V

    sget-object v2, Lc4/h;->a:Lc4/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v4, :cond_6

    :try_start_2
    invoke-virtual {v4}, Ls4/l1;->X()Z

    move-result v2

    if-eqz v2, :cond_7

    :cond_6
    invoke-static {v3, v1}, Lkotlinx/coroutines/internal/q;->a(Le4/f;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_7
    :try_start_3
    invoke-interface {v0}, Lkotlinx/coroutines/scheduling/h;->a()V

    sget-object v0, Lc4/h;->a:Lc4/h;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    invoke-static {v0}, La1/f0;->e(Ljava/lang/Throwable;)Lc4/d$a;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Lc4/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v5, v0}, Ls4/g0;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_7

    :goto_5
    if-eqz v4, :cond_8

    :try_start_4
    invoke-virtual {v4}, Ls4/l1;->X()Z

    move-result v4

    if-eqz v4, :cond_9

    :cond_8
    invoke-static {v3, v1}, Lkotlinx/coroutines/internal/q;->a(Le4/f;Ljava/lang/Object;)V

    :cond_9
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v1

    :try_start_5
    invoke-interface {v0}, Lkotlinx/coroutines/scheduling/h;->a()V

    sget-object v0, Lc4/h;->a:Lc4/h;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception v0

    invoke-static {v0}, La1/f0;->e(Ljava/lang/Throwable;)Lc4/d$a;

    move-result-object v0

    :goto_6
    invoke-static {v0}, Lc4/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Ls4/g0;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_7
    return-void
.end method
