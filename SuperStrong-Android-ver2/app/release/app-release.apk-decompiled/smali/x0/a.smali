.class public final synthetic Lx0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/m;


# instance fields
.field public final synthetic b:Lx0/b;


# direct methods
.method public synthetic constructor <init>(Lx0/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/a;->b:Lx0/b;

    return-void
.end method


# virtual methods
.method public final f(Landroidx/lifecycle/o;Landroidx/lifecycle/j$b;)V
    .locals 1

    iget-object p1, p0, Lx0/a;->b:Lx0/b;

    const-string v0, "this$0"

    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/j$b;->ON_START:Landroidx/lifecycle/j$b;

    if-ne p2, v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/lifecycle/j$b;->ON_STOP:Landroidx/lifecycle/j$b;

    if-ne p2, v0, :cond_1

    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p1, Lx0/b;->f:Z

    :cond_1
    return-void
.end method
