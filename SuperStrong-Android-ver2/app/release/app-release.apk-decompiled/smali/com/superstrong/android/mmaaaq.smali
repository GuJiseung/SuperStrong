.class public Lcom/superstrong/android/mmaaaq;
.super Landroidx/appcompat/app/c;
.source "SourceFile"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "helloNdk"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/r;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0026

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    new-instance p1, Lcom/superstrong/android/ciiicu;

    invoke-direct {p1}, Lcom/superstrong/android/ciiicu;-><init>()V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/superstrong/android/view/lallaaaalllaa;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
