.class public final Lg5/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv4/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg5/t;->k(Lg5/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lg5/d;

.field public final synthetic b:Lg5/t;


# direct methods
.method public constructor <init>(Lg5/t;Lg5/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lg5/t$a;->b:Lg5/t;

    iput-object p2, p0, Lg5/t$a;->a:Lg5/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lg5/t$a;->a:Lg5/d;

    iget-object v1, p0, Lg5/t$a;->b:Lg5/t;

    invoke-interface {v0, v1, p1}, Lg5/d;->a(Lg5/b;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lg5/h0;->m(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public final b(Lv4/b0;)V
    .locals 2

    iget-object v0, p0, Lg5/t$a;->b:Lg5/t;

    :try_start_0
    invoke-virtual {v0, p1}, Lg5/t;->c(Lv4/b0;)Lg5/b0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lg5/t$a;->a:Lg5/d;

    invoke-interface {v1, v0, p1}, Lg5/d;->b(Lg5/b;Lg5/b0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lg5/h0;->m(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void

    :catchall_1
    move-exception p1

    invoke-static {p1}, Lg5/h0;->m(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Lg5/t$a;->a(Ljava/lang/Throwable;)V

    return-void
.end method
