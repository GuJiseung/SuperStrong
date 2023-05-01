.class public final Landroidx/fragment/app/i0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:Landroidx/fragment/app/o;

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Landroidx/lifecycle/j$c;

.field public i:Landroidx/lifecycle/j$c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ILandroidx/fragment/app/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/fragment/app/i0$a;->a:I

    iput-object p2, p0, Landroidx/fragment/app/i0$a;->b:Landroidx/fragment/app/o;

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/fragment/app/i0$a;->c:Z

    sget-object p1, Landroidx/lifecycle/j$c;->f:Landroidx/lifecycle/j$c;

    iput-object p1, p0, Landroidx/fragment/app/i0$a;->h:Landroidx/lifecycle/j$c;

    iput-object p1, p0, Landroidx/fragment/app/i0$a;->i:Landroidx/lifecycle/j$c;

    return-void
.end method

.method public constructor <init>(ILandroidx/fragment/app/o;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/fragment/app/i0$a;->a:I

    iput-object p2, p0, Landroidx/fragment/app/i0$a;->b:Landroidx/fragment/app/o;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/i0$a;->c:Z

    sget-object p1, Landroidx/lifecycle/j$c;->f:Landroidx/lifecycle/j$c;

    iput-object p1, p0, Landroidx/fragment/app/i0$a;->h:Landroidx/lifecycle/j$c;

    iput-object p1, p0, Landroidx/fragment/app/i0$a;->i:Landroidx/lifecycle/j$c;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/o;Landroidx/lifecycle/j$c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    iput v0, p0, Landroidx/fragment/app/i0$a;->a:I

    iput-object p1, p0, Landroidx/fragment/app/i0$a;->b:Landroidx/fragment/app/o;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/i0$a;->c:Z

    iget-object p1, p1, Landroidx/fragment/app/o;->M:Landroidx/lifecycle/j$c;

    iput-object p1, p0, Landroidx/fragment/app/i0$a;->h:Landroidx/lifecycle/j$c;

    iput-object p2, p0, Landroidx/fragment/app/i0$a;->i:Landroidx/lifecycle/j$c;

    return-void
.end method
