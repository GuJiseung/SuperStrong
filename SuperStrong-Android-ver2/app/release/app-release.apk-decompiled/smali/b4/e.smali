.class public final Lb4/e;
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

.field public final e:Ly3/h;

.field public final f:Landroidx/lifecycle/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/s<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Landroidx/lifecycle/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/s<",
            "Ljava/lang/Boolean;",
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


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/lifecycle/f0;-><init>()V

    new-instance v0, Landroidx/lifecycle/s;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/lifecycle/s;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb4/e;->d:Landroidx/lifecycle/s;

    new-instance v0, Ly3/h;

    invoke-direct {v0}, Ly3/h;-><init>()V

    iput-object v0, p0, Lb4/e;->e:Ly3/h;

    new-instance v0, Landroidx/lifecycle/s;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/lifecycle/s;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb4/e;->f:Landroidx/lifecycle/s;

    new-instance v0, Landroidx/lifecycle/s;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Landroidx/lifecycle/s;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb4/e;->g:Landroidx/lifecycle/s;

    new-instance v0, Landroidx/lifecycle/s;

    invoke-direct {v0, v1}, Landroidx/lifecycle/s;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb4/e;->h:Landroidx/lifecycle/s;

    return-void
.end method
