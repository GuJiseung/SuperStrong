.class public final Lf0/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/g$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/view/ContentInfo$Builder;


# direct methods
.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/view/ContentInfo$Builder;

    invoke-direct {v0, p1, p2}, Landroid/view/ContentInfo$Builder;-><init>(Landroid/content/ClipData;I)V

    iput-object v0, p0, Lf0/g$a;->a:Landroid/view/ContentInfo$Builder;

    return-void
.end method


# virtual methods
.method public final a(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, Lf0/g$a;->a:Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, Lf0/f;->a(Landroid/view/ContentInfo$Builder;Landroid/net/Uri;)V

    return-void
.end method

.method public final b(I)V
    .locals 1

    iget-object v0, p0, Lf0/g$a;->a:Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, Lf0/c;->b(Landroid/view/ContentInfo$Builder;I)V

    return-void
.end method

.method public final build()Lf0/g;
    .locals 3

    new-instance v0, Lf0/g;

    new-instance v1, Lf0/g$d;

    iget-object v2, p0, Lf0/g$a;->a:Landroid/view/ContentInfo$Builder;

    invoke-static {v2}, Lf0/d;->a(Landroid/view/ContentInfo$Builder;)Landroid/view/ContentInfo;

    move-result-object v2

    invoke-direct {v1, v2}, Lf0/g$d;-><init>(Landroid/view/ContentInfo;)V

    invoke-direct {v0, v1}, Lf0/g;-><init>(Lf0/g$e;)V

    return-object v0
.end method

.method public final setExtras(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lf0/g$a;->a:Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, Lf0/e;->b(Landroid/view/ContentInfo$Builder;Landroid/os/Bundle;)V

    return-void
.end method
