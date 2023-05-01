.class public final Landroidx/lifecycle/b0$a;
.super Ll4/g;
.source "SourceFile"

# interfaces
.implements Lk4/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/b0;-><init>(Lx0/b;Landroidx/lifecycle/l0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll4/g;",
        "Lk4/a<",
        "Landroidx/lifecycle/c0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic c:Landroidx/lifecycle/l0;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/l0;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/b0$a;->c:Landroidx/lifecycle/l0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ll4/g;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/b0$a;->c:Landroidx/lifecycle/l0;

    invoke-static {v0}, Landroidx/lifecycle/a0;->c(Landroidx/lifecycle/l0;)Landroidx/lifecycle/c0;

    move-result-object v0

    return-object v0
.end method
