.class public final Ld/g$h$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld/g$h;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ld/g$h;


# direct methods
.method public constructor <init>(Ld/g$h;)V
    .locals 0

    iput-object p1, p0, Ld/g$h$a;->a:Ld/g$h;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, Ld/g$h$a;->a:Ld/g$h;

    invoke-virtual {p1}, Ld/g$h;->d()V

    return-void
.end method
