.class public final Lb4/r;
.super Landroidx/lifecycle/f0;
.source "SourceFile"


# instance fields
.field public final d:Landroidx/lifecycle/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/s<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Landroidx/lifecycle/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/s<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Landroidx/lifecycle/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/s<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Landroidx/lifecycle/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/s<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Landroidx/lifecycle/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/s<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ly3/w;

.field public j:Ly3/e0;

.field public final k:Landroidx/lifecycle/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/s<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/lifecycle/f0;-><init>()V

    new-instance v0, Landroidx/lifecycle/s;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/lifecycle/s;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb4/r;->d:Landroidx/lifecycle/s;

    new-instance v0, Landroidx/lifecycle/s;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v2}, Landroidx/lifecycle/s;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb4/r;->e:Landroidx/lifecycle/s;

    new-instance v0, Landroidx/lifecycle/s;

    invoke-direct {v0, v2}, Landroidx/lifecycle/s;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb4/r;->f:Landroidx/lifecycle/s;

    new-instance v0, Landroidx/lifecycle/s;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v3}, Landroidx/lifecycle/s;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb4/r;->g:Landroidx/lifecycle/s;

    new-instance v0, Landroidx/lifecycle/s;

    invoke-direct {v0, v2}, Landroidx/lifecycle/s;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb4/r;->h:Landroidx/lifecycle/s;

    new-instance v0, Ly3/w;

    invoke-direct {v0}, Ly3/w;-><init>()V

    iput-object v0, p0, Lb4/r;->i:Ly3/w;

    new-instance v0, Landroidx/lifecycle/s;

    invoke-direct {v0, v1}, Landroidx/lifecycle/s;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb4/r;->k:Landroidx/lifecycle/s;

    return-void
.end method
