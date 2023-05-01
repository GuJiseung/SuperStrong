.class public final Ld3/e;
.super Landroidx/activity/result/c;
.source "SourceFile"


# instance fields
.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Landroid/text/TextPaint;

.field public final synthetic e:Landroidx/activity/result/c;

.field public final synthetic f:Ld3/d;


# direct methods
.method public constructor <init>(Ld3/d;Landroid/content/Context;Landroid/text/TextPaint;Landroidx/activity/result/c;)V
    .locals 0

    iput-object p1, p0, Ld3/e;->f:Ld3/d;

    iput-object p2, p0, Ld3/e;->c:Landroid/content/Context;

    iput-object p3, p0, Ld3/e;->d:Landroid/text/TextPaint;

    iput-object p4, p0, Ld3/e;->e:Landroidx/activity/result/c;

    invoke-direct {p0}, Landroidx/activity/result/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final w(I)V
    .locals 1

    iget-object v0, p0, Ld3/e;->e:Landroidx/activity/result/c;

    invoke-virtual {v0, p1}, Landroidx/activity/result/c;->w(I)V

    return-void
.end method

.method public final x(Landroid/graphics/Typeface;Z)V
    .locals 3

    iget-object v0, p0, Ld3/e;->d:Landroid/text/TextPaint;

    iget-object v1, p0, Ld3/e;->f:Ld3/d;

    iget-object v2, p0, Ld3/e;->c:Landroid/content/Context;

    invoke-virtual {v1, v2, v0, p1}, Ld3/d;->g(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    iget-object v0, p0, Ld3/e;->e:Landroidx/activity/result/c;

    invoke-virtual {v0, p1, p2}, Landroidx/activity/result/c;->x(Landroid/graphics/Typeface;Z)V

    return-void
.end method
