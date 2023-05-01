.class public final Lr1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk1/w;
.implements Lk1/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lk1/w<",
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;",
        "Lk1/s;"
    }
.end annotation


# instance fields
.field public final b:Landroid/content/res/Resources;

.field public final c:Lk1/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk1/w<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lk1/w;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "Lk1/w<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Landroidx/activity/k;->h(Ljava/lang/Object;)V

    iput-object p1, p0, Lr1/u;->b:Landroid/content/res/Resources;

    invoke-static {p2}, Landroidx/activity/k;->h(Ljava/lang/Object;)V

    iput-object p2, p0, Lr1/u;->c:Lk1/w;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lr1/u;->c:Lk1/w;

    instance-of v1, v0, Lk1/s;

    if-eqz v1, :cond_0

    check-cast v0, Lk1/s;

    invoke-interface {v0}, Lk1/s;->a()V

    :cond_0
    return-void
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, Lr1/u;->c:Lk1/w;

    invoke-interface {v0}, Lk1/w;->c()I

    move-result v0

    return v0
.end method

.method public final d()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    const-class v0, Landroid/graphics/drawable/BitmapDrawable;

    return-object v0
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lr1/u;->c:Lk1/w;

    invoke-interface {v0}, Lk1/w;->e()V

    return-void
.end method

.method public final get()Ljava/lang/Object;
    .locals 3

    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v1, p0, Lr1/u;->c:Lk1/w;

    invoke-interface {v1}, Lk1/w;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    iget-object v2, p0, Lr1/u;->b:Landroid/content/res/Resources;

    invoke-direct {v0, v2, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object v0
.end method
