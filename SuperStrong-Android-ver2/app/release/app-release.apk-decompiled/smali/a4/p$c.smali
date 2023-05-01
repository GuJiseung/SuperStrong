.class public final La4/p$c;
.super Ll4/g;
.source "SourceFile"

# interfaces
.implements Lk4/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La4/p;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll4/g;",
        "Lk4/a<",
        "Landroidx/lifecycle/i0$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic c:Landroidx/fragment/app/o;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/o;)V
    .locals 0

    iput-object p1, p0, La4/p$c;->c:Landroidx/fragment/app/o;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ll4/g;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, La4/p$c;->c:Landroidx/fragment/app/o;

    invoke-virtual {v0}, Landroidx/fragment/app/o;->K()Landroidx/fragment/app/r;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->j()Landroidx/lifecycle/i0$b;

    move-result-object v0

    const-string v1, "requireActivity().defaultViewModelProviderFactory"

    invoke-static {v0, v1}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
