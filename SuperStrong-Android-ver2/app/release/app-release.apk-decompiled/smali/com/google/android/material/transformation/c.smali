.class public final Lcom/google/android/material/transformation/c;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ls2/d;


# direct methods
.method public constructor <init>(Ls2/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/transformation/c;->a:Ls2/d;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object p1, p0, Lcom/google/android/material/transformation/c;->a:Ls2/d;

    invoke-interface {p1}, Ls2/d;->getRevealInfo()Ls2/d$d;

    move-result-object v0

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    iput v1, v0, Ls2/d$d;->c:F

    invoke-interface {p1, v0}, Ls2/d;->setRevealInfo(Ls2/d$d;)V

    return-void
.end method
