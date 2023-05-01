.class public final Lg5/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg5/s;->a(Ljava/lang/Exception;Le4/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic b:Le4/d;

.field public final synthetic c:Ljava/lang/Exception;


# direct methods
.method public constructor <init>(Ljava/lang/Exception;Lg5/s$b;)V
    .locals 0

    iput-object p2, p0, Lg5/s$a;->b:Le4/d;

    iput-object p1, p0, Lg5/s$a;->c:Ljava/lang/Exception;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg5/s$a;->b:Le4/d;

    invoke-static {v0}, Lc0/n;->g(Le4/d;)Le4/d;

    move-result-object v0

    iget-object v1, p0, Lg5/s$a;->c:Ljava/lang/Exception;

    invoke-static {v1}, La1/f0;->e(Ljava/lang/Throwable;)Lc4/d$a;

    move-result-object v1

    invoke-interface {v0, v1}, Le4/d;->d(Ljava/lang/Object;)V

    return-void
.end method
