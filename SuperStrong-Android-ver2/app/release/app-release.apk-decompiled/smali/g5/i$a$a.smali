.class public final Lg5/i$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg5/i$a;->k(Lg5/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg5/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lg5/d;

.field public final synthetic b:Lg5/i$a;


# direct methods
.method public constructor <init>(Lg5/i$a;Lg5/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lg5/i$a$a;->b:Lg5/i$a;

    iput-object p2, p0, Lg5/i$a$a;->a:Lg5/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lg5/b;Ljava/lang/Throwable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/b<",
            "TT;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, Lg5/i$a$a;->b:Lg5/i$a;

    iget-object p1, p1, Lg5/i$a;->b:Ljava/util/concurrent/Executor;

    new-instance v0, Landroidx/emoji2/text/g;

    const/4 v1, 0x1

    iget-object v2, p0, Lg5/i$a$a;->a:Lg5/d;

    invoke-direct {v0, v1, p0, v2, p2}, Landroidx/emoji2/text/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b(Lg5/b;Lg5/b0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/b<",
            "TT;>;",
            "Lg5/b0<",
            "TT;>;)V"
        }
    .end annotation

    iget-object p1, p0, Lg5/i$a$a;->b:Lg5/i$a;

    iget-object p1, p1, Lg5/i$a;->b:Ljava/util/concurrent/Executor;

    new-instance v0, Lg5/h;

    iget-object v1, p0, Lg5/i$a$a;->a:Lg5/d;

    invoke-direct {v0, p0, v1, p2}, Lg5/h;-><init>(Lg5/i$a$a;Lg5/d;Lg5/b0;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
