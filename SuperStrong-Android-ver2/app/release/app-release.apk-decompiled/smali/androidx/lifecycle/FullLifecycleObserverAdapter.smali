.class Landroidx/lifecycle/FullLifecycleObserverAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/m;


# instance fields
.field public final b:Landroidx/lifecycle/f;

.field public final c:Landroidx/lifecycle/m;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/f;Landroidx/lifecycle/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->b:Landroidx/lifecycle/f;

    iput-object p2, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->c:Landroidx/lifecycle/m;

    return-void
.end method


# virtual methods
.method public final f(Landroidx/lifecycle/o;Landroidx/lifecycle/j$b;)V
    .locals 2

    sget-object v0, Landroidx/lifecycle/FullLifecycleObserverAdapter$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    iget-object v1, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->b:Landroidx/lifecycle/f;

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "ON_ANY must not been send by anybody"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    invoke-interface {v1}, Landroidx/lifecycle/f;->b()V

    goto :goto_0

    :pswitch_2
    invoke-interface {v1}, Landroidx/lifecycle/f;->a()V

    goto :goto_0

    :pswitch_3
    invoke-interface {v1}, Landroidx/lifecycle/f;->e()V

    goto :goto_0

    :pswitch_4
    invoke-interface {v1}, Landroidx/lifecycle/f;->g()V

    goto :goto_0

    :pswitch_5
    invoke-interface {v1}, Landroidx/lifecycle/f;->c()V

    goto :goto_0

    :pswitch_6
    invoke-interface {v1}, Landroidx/lifecycle/f;->d()V

    :goto_0
    iget-object v0, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->c:Landroidx/lifecycle/m;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Landroidx/lifecycle/m;->f(Landroidx/lifecycle/o;Landroidx/lifecycle/j$b;)V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
