.class public final Landroidx/lifecycle/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/o;


# static fields
.field public static final j:Landroidx/lifecycle/v;


# instance fields
.field public b:I

.field public c:I

.field public d:Z

.field public e:Z

.field public f:Landroid/os/Handler;

.field public final g:Landroidx/lifecycle/p;

.field public final h:Landroidx/lifecycle/v$a;

.field public final i:Landroidx/lifecycle/v$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/v;

    invoke-direct {v0}, Landroidx/lifecycle/v;-><init>()V

    sput-object v0, Landroidx/lifecycle/v;->j:Landroidx/lifecycle/v;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/lifecycle/v;->b:I

    iput v0, p0, Landroidx/lifecycle/v;->c:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/v;->d:Z

    iput-boolean v0, p0, Landroidx/lifecycle/v;->e:Z

    new-instance v0, Landroidx/lifecycle/p;

    invoke-direct {v0, p0}, Landroidx/lifecycle/p;-><init>(Landroidx/lifecycle/o;)V

    iput-object v0, p0, Landroidx/lifecycle/v;->g:Landroidx/lifecycle/p;

    new-instance v0, Landroidx/lifecycle/v$a;

    invoke-direct {v0, p0}, Landroidx/lifecycle/v$a;-><init>(Landroidx/lifecycle/v;)V

    iput-object v0, p0, Landroidx/lifecycle/v;->h:Landroidx/lifecycle/v$a;

    new-instance v0, Landroidx/lifecycle/v$b;

    invoke-direct {v0, p0}, Landroidx/lifecycle/v$b;-><init>(Landroidx/lifecycle/v;)V

    iput-object v0, p0, Landroidx/lifecycle/v;->i:Landroidx/lifecycle/v$b;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/v;->c:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/v;->c:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Landroidx/lifecycle/v;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/v;->g:Landroidx/lifecycle/p;

    sget-object v1, Landroidx/lifecycle/j$b;->ON_RESUME:Landroidx/lifecycle/j$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/p;->f(Landroidx/lifecycle/j$b;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/v;->d:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/v;->f:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/lifecycle/v;->h:Landroidx/lifecycle/v$a;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final v()Landroidx/lifecycle/p;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/v;->g:Landroidx/lifecycle/p;

    return-object v0
.end method
