.class public final Landroidx/lifecycle/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/i$a;
    }
.end annotation


# direct methods
.method public static a(Landroidx/lifecycle/j;Lx0/b;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/lifecycle/j;->b()Landroidx/lifecycle/j$c;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/j$c;->c:Landroidx/lifecycle/j$c;

    if-eq v0, v1, :cond_1

    sget-object v1, Landroidx/lifecycle/j$c;->e:Landroidx/lifecycle/j$c;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/j$c;->a(Landroidx/lifecycle/j$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/lifecycle/LegacySavedStateHandleController$1;

    invoke-direct {v0, p0, p1}, Landroidx/lifecycle/LegacySavedStateHandleController$1;-><init>(Landroidx/lifecycle/j;Lx0/b;)V

    invoke-virtual {p0, v0}, Landroidx/lifecycle/j;->a(Landroidx/lifecycle/n;)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lx0/b;->d()V

    :goto_1
    return-void
.end method
