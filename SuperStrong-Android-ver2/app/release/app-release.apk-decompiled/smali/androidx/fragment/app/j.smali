.class public final Landroidx/fragment/app/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/fragment/app/p0;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/p0;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/j;->b:Landroidx/fragment/app/p0;

    iput-object p2, p0, Landroidx/fragment/app/j;->c:Landroid/view/View;

    iput-object p3, p0, Landroidx/fragment/app/j;->d:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/j;->b:Landroidx/fragment/app/p0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Landroidx/fragment/app/j;->c:Landroid/view/View;

    iget-object v1, p0, Landroidx/fragment/app/j;->d:Landroid/graphics/Rect;

    invoke-static {v0, v1}, Landroidx/fragment/app/p0;->g(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method
