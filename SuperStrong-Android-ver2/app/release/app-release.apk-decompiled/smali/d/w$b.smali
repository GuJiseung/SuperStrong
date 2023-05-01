.class public final Ld/w$b;
.super Lc/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic n:Ld/w;


# direct methods
.method public constructor <init>(Ld/w;)V
    .locals 0

    iput-object p1, p0, Ld/w$b;->n:Ld/w;

    invoke-direct {p0}, Lc/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Ld/w$b;->n:Ld/w;

    const/4 v1, 0x0

    iput-object v1, v0, Ld/w;->t:Lg/g;

    iget-object v0, v0, Ld/w;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    return-void
.end method
