.class Landroidx/lifecycle/LegacySavedStateHandleController$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/m;


# instance fields
.field public final synthetic b:Landroidx/lifecycle/j;

.field public final synthetic c:Lx0/b;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/j;Lx0/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/LegacySavedStateHandleController$1;->b:Landroidx/lifecycle/j;

    iput-object p2, p0, Landroidx/lifecycle/LegacySavedStateHandleController$1;->c:Lx0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Landroidx/lifecycle/o;Landroidx/lifecycle/j$b;)V
    .locals 0

    sget-object p1, Landroidx/lifecycle/j$b;->ON_START:Landroidx/lifecycle/j$b;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Landroidx/lifecycle/LegacySavedStateHandleController$1;->b:Landroidx/lifecycle/j;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/j;->c(Landroidx/lifecycle/n;)V

    iget-object p1, p0, Landroidx/lifecycle/LegacySavedStateHandleController$1;->c:Lx0/b;

    invoke-virtual {p1}, Lx0/b;->d()V

    :cond_0
    return-void
.end method
