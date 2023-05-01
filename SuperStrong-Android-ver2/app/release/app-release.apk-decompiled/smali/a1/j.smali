.class public final La1/j;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ll/b;

.field public final synthetic b:La1/i;


# direct methods
.method public constructor <init>(La1/i;Ll/b;)V
    .locals 0

    iput-object p1, p0, La1/j;->b:La1/i;

    iput-object p2, p0, La1/j;->a:Ll/b;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, La1/j;->a:Ll/b;

    invoke-virtual {v0, p1}, Ll/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La1/j;->b:La1/i;

    iget-object v0, v0, La1/i;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, La1/j;->b:La1/i;

    iget-object v0, v0, La1/i;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
