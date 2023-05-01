.class public final Lb4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg5/d<",
        "Lq3/q;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/superstrong/android/view/PaymentActivity2;)V
    .locals 0

    iput-object p1, p0, Lb4/m;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lg5/b;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/b<",
            "Lq3/q;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "t"

    invoke-static {p2, p1}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "\ud1b5\uc2e0 \uc2e4\ud328: PaymentVModel2"

    const/4 p2, 0x0

    iget-object v0, p0, Lb4/m;->a:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final b(Lg5/b;Lg5/b0;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/b<",
            "Lq3/q;",
            ">;",
            "Lg5/b0<",
            "Lq3/q;",
            ">;)V"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "response"

    invoke-static {p2, p1}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lg5/b0;->a()Z

    move-result p1

    const-string v0, "\uc1a1\uae08\uc5d0 \uc2e4\ud328\ud588\uc2b5\ub2c8\ub2e4."

    const/4 v1, 0x0

    iget-object v2, p0, Lb4/m;->a:Landroid/content/Context;

    if-eqz p1, :cond_4

    iget-object p1, p2, Lg5/b0;->b:Ljava/lang/Object;

    check-cast p1, Lq3/q;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lq3/n;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    new-instance p2, Lq3/j;

    invoke-direct {p2}, Lq3/j;-><init>()V

    invoke-virtual {p2, p1}, Lq3/j;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lq3/q;

    const-string v3, "e2e_res"

    invoke-virtual {p2, v3}, Lq3/q;->c(Ljava/lang/String;)Lq3/n;

    move-result-object p2

    invoke-virtual {p2}, Lq3/n;->b()Ljava/lang/String;

    move-result-object p2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "data:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "rww"

    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "reponse:"

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v6, "\ub9ac\uc2a4\ud3f0\uc2a4 (Payment2)"

    invoke-static {v6, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v3, Lb4/b;->a:Ljava/lang/String;

    const-string v3, "data"

    invoke-static {p2, v3}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lb4/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v3, "decoded_data:"

    invoke-virtual {v3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v3, Lq3/j;

    invoke-direct {v3}, Lq3/j;-><init>()V

    invoke-virtual {v3, p2}, Lq3/j;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lq3/q;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "jsonObject2:"

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "\ub9ac\uc2a4\ud3f0\uc2a4"

    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v3, "res"

    invoke-virtual {p2, v3}, Lq3/q;->c(Ljava/lang/String;)Lq3/n;

    move-result-object v6

    invoke-virtual {v6}, Lq3/n;->b()Ljava/lang/String;

    move-result-object v6

    const-string v7, "0"

    invoke-static {v6, v7}, Ll4/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {p2, v3}, Lq3/q;->c(Ljava/lang/String;)Lq3/n;

    move-result-object v6

    invoke-virtual {v6}, Lq3/n;->b()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p2, v3}, Lq3/q;->c(Ljava/lang/String;)Lq3/n;

    move-result-object p2

    invoke-virtual {p2}, Lq3/n;->b()Ljava/lang/String;

    move-result-object p2

    const-string v0, "2"

    invoke-static {p2, v0}, Ll4/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "\uc720\ud6a8\ud558\uc9c0 \uc54a\uc740 \ud1a0\ud070\uc785\ub2c8\ub2e4."

    invoke-static {v2, p2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/Toast;->show()V

    new-instance p2, Landroid/content/Intent;

    const-class v0, Lcom/superstrong/android/view/lallaaaalllaa;

    invoke-direct {p2, v2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :cond_2
    new-instance p2, Landroid/content/Intent;

    const-class v0, Lcom/superstrong/android/view/PaymentActivity3;

    invoke-direct {p2, v2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    :goto_1
    invoke-virtual {v2, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/Toast;->show()V

    :goto_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_4
    iget-object p1, p2, Lg5/b0;->c:Lv4/d0;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_5
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :goto_4
    return-void
.end method
