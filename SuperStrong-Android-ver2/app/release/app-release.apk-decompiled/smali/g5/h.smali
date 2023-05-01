.class public final synthetic Lg5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lg5/i$a$a;

.field public final synthetic c:Lg5/d;

.field public final synthetic d:Lg5/b0;


# direct methods
.method public synthetic constructor <init>(Lg5/i$a$a;Lg5/d;Lg5/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/h;->b:Lg5/i$a$a;

    iput-object p2, p0, Lg5/h;->c:Lg5/d;

    iput-object p3, p0, Lg5/h;->d:Lg5/b0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lg5/h;->b:Lg5/i$a$a;

    iget-object v0, v0, Lg5/i$a$a;->b:Lg5/i$a;

    iget-object v1, v0, Lg5/i$a;->c:Lg5/b;

    invoke-interface {v1}, Lg5/b;->o()Z

    move-result v1

    iget-object v2, p0, Lg5/h;->c:Lg5/d;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/io/IOException;

    const-string v3, "Canceled"

    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-interface {v2, v0, v1}, Lg5/d;->a(Lg5/b;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lg5/h;->d:Lg5/b0;

    invoke-interface {v2, v0, v1}, Lg5/d;->b(Lg5/b;Lg5/b0;)V

    :goto_0
    return-void
.end method
