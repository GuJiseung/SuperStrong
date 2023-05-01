.class public final Ls2/a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ls2/d;


# direct methods
.method public constructor <init>(Ls2/d;)V
    .locals 0

    iput-object p1, p0, Ls2/a;->a:Ls2/d;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Ls2/a;->a:Ls2/d;

    invoke-interface {p1}, Ls2/d;->a()V

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Ls2/a;->a:Ls2/d;

    invoke-interface {p1}, Ls2/d;->b()V

    return-void
.end method
