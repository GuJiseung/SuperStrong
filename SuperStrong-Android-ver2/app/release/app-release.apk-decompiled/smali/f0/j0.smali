.class public final synthetic Lf0/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnUnhandledKeyEventListener;


# instance fields
.field public final synthetic a:Lf0/g0$r;


# direct methods
.method public synthetic constructor <init>(Lf0/g0$r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/j0;->a:Lf0/g0$r;

    return-void
.end method


# virtual methods
.method public final onUnhandledKeyEvent(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 0

    iget-object p1, p0, Lf0/j0;->a:Lf0/g0$r;

    invoke-interface {p1}, Lf0/g0$r;->a()Z

    move-result p1

    return p1
.end method
