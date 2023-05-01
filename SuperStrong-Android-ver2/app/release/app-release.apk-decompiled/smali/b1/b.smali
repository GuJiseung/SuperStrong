.class public final Lb1/b;
.super Landroid/graphics/drawable/Animatable2$AnimationCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lb1/c;


# direct methods
.method public constructor <init>(Lb1/c;)V
    .locals 0

    iput-object p1, p0, Lb1/b;->a:Lb1/c;

    invoke-direct {p0}, Landroid/graphics/drawable/Animatable2$AnimationCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lb1/b;->a:Lb1/c;

    invoke-virtual {v0, p1}, Lb1/c;->a(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final onAnimationStart(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lb1/b;->a:Lb1/c;

    invoke-virtual {v0, p1}, Lb1/c;->b(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
