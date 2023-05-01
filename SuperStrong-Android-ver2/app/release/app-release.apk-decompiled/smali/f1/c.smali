.class public final Lf1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/b;


# instance fields
.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lf1/c;->b:Ljava/lang/Object;

    iput-object p2, p0, Lf1/c;->c:Ljava/lang/Object;

    iput-object p3, p0, Lf1/c;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lk1/w;Li1/h;)Lk1/w;
    .locals 2

    invoke-interface {p1}, Lk1/w;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_0

    iget-object p1, p0, Lf1/c;->c:Ljava/lang/Object;

    check-cast p1, Lw1/b;

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lf1/c;->b:Ljava/lang/Object;

    check-cast v1, Ll1/d;

    invoke-static {v0, v1}, Lr1/e;->b(Landroid/graphics/Bitmap;Ll1/d;)Lr1/e;

    move-result-object v0

    invoke-interface {p1, v0, p2}, Lw1/b;->a(Lk1/w;Li1/h;)Lk1/w;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, v0, Lv1/c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lf1/c;->d:Ljava/lang/Object;

    check-cast v0, Lw1/b;

    invoke-interface {v0, p1, p2}, Lw1/b;->a(Lk1/w;Li1/h;)Lk1/w;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
