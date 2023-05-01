.class public final Landroidx/fragment/app/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/fragment/app/m$c;

.field public final synthetic c:Landroidx/fragment/app/v0$b;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m$c;Landroidx/fragment/app/v0$b;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/l;->b:Landroidx/fragment/app/m$c;

    iput-object p2, p0, Landroidx/fragment/app/l;->c:Landroidx/fragment/app/v0$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/l;->b:Landroidx/fragment/app/m$c;

    invoke-virtual {v0}, Landroidx/fragment/app/m$b;->a()V

    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/a0;->J(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Transition for operation "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/l;->c:Landroidx/fragment/app/v0$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "has completed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method
