.class public Lg0/g$b;
.super Lg0/g$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Lg0/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lg0/g$a;-><init>(Lg0/g;)V

    return-void
.end method


# virtual methods
.method public final findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 1

    iget-object v0, p0, Lg0/g$a;->a:Lg0/g;

    invoke-virtual {v0, p1}, Lg0/g;->b(I)Lg0/f;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p1, Lg0/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    return-object p1
.end method
