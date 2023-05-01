.class public final Lp/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Lo/d;Lm/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v0, p1, Lo/d;->K:Lo/c;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lm/d;->o(Lo/c;)I

    iget-object p2, p1, Lo/d;->L:Lo/c;

    invoke-static {p2}, Lm/d;->o(Lo/c;)I

    iget-object p2, p1, Lo/d;->M:Lo/c;

    invoke-static {p2}, Lm/d;->o(Lo/c;)I

    iget-object p2, p1, Lo/d;->N:Lo/c;

    invoke-static {p2}, Lm/d;->o(Lo/c;)I

    iget-object p1, p1, Lo/d;->O:Lo/c;

    invoke-static {p1}, Lm/d;->o(Lo/c;)I

    return-void
.end method
