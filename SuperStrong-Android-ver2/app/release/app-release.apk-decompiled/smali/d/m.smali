.class public final synthetic Ld/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/l$a;


# instance fields
.field public final synthetic b:Ld/n;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/app/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld/m;->b:Ld/n;

    return-void
.end method


# virtual methods
.method public final e(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Ld/m;->b:Ld/n;

    invoke-virtual {v0, p1}, Ld/n;->h(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
