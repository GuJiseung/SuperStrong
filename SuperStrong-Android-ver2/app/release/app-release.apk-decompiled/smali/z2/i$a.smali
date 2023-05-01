.class public final Lz2/i$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lz2/i;


# direct methods
.method public constructor <init>(Lz2/i;)V
    .locals 0

    iput-object p1, p0, Lz2/i$a;->a:Lz2/i;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Lz2/i$a;->a:Lz2/i;

    iget-object v1, v0, Lz2/i;->b:Landroid/animation/ValueAnimator;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, v0, Lz2/i;->b:Landroid/animation/ValueAnimator;

    :cond_0
    return-void
.end method
