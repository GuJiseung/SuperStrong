.class public final Landroidx/lifecycle/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ls4/w;


# instance fields
.field public final b:Le4/f;


# direct methods
.method public constructor <init>(Le4/f;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/c;->b:Le4/f;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    sget-object v0, Ls4/u0$b;->b:Ls4/u0$b;

    iget-object v1, p0, Landroidx/lifecycle/c;->b:Le4/f;

    invoke-interface {v1, v0}, Le4/f;->get(Le4/f$c;)Le4/f$b;

    move-result-object v0

    check-cast v0, Ls4/u0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ls4/u0;->w(Ljava/util/concurrent/CancellationException;)V

    :goto_0
    return-void
.end method

.method public final h()Le4/f;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/c;->b:Le4/f;

    return-object v0
.end method
