.class public final Lz2/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz2/q;->a(Landroid/view/View;Lz2/q$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lz2/q$b;

.field public final synthetic b:Lz2/q$c;


# direct methods
.method public constructor <init>(Lz2/q$b;Lz2/q$c;)V
    .locals 0

    iput-object p1, p0, Lz2/q$a;->a:Lz2/q$b;

    iput-object p2, p0, Lz2/q$a;->b:Lz2/q$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Lf0/x0;)Lf0/x0;
    .locals 2

    new-instance v0, Lz2/q$c;

    iget-object v1, p0, Lz2/q$a;->b:Lz2/q$c;

    invoke-direct {v0, v1}, Lz2/q$c;-><init>(Lz2/q$c;)V

    iget-object v1, p0, Lz2/q$a;->a:Lz2/q$b;

    invoke-interface {v1, p1, p2, v0}, Lz2/q$b;->a(Landroid/view/View;Lf0/x0;Lz2/q$c;)Lf0/x0;

    move-result-object p1

    return-object p1
.end method
