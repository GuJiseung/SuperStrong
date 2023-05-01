.class public final Landroidx/appcompat/widget/n1$a;
.super Lc/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/n1;->r(IJ)Lf0/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public n:Z

.field public final synthetic o:I

.field public final synthetic p:Landroidx/appcompat/widget/n1;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/n1;I)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/n1$a;->p:Landroidx/appcompat/widget/n1;

    iput p2, p0, Landroidx/appcompat/widget/n1$a;->o:I

    invoke-direct {p0}, Lc/a;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/appcompat/widget/n1$a;->n:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-boolean v0, p0, Landroidx/appcompat/widget/n1$a;->n:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/n1$a;->p:Landroidx/appcompat/widget/n1;

    iget-object v0, v0, Landroidx/appcompat/widget/n1;->a:Landroidx/appcompat/widget/Toolbar;

    iget v1, p0, Landroidx/appcompat/widget/n1$a;->o:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/appcompat/widget/n1$a;->n:Z

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/n1$a;->p:Landroidx/appcompat/widget/n1;

    iget-object v0, v0, Landroidx/appcompat/widget/n1;->a:Landroidx/appcompat/widget/Toolbar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
