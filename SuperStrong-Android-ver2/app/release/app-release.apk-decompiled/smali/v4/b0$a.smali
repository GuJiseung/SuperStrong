.class public final Lv4/b0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv4/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lv4/x;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public b:Lv4/v;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Lv4/o;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public f:Lv4/p$a;

.field public g:Lv4/d0;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public h:Lv4/b0;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public i:Lv4/b0;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public j:Lv4/b0;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public k:J

.field public l:J

.field public m:Ly4/c;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lv4/b0$a;->c:I

    new-instance v0, Lv4/p$a;

    invoke-direct {v0}, Lv4/p$a;-><init>()V

    iput-object v0, p0, Lv4/b0$a;->f:Lv4/p$a;

    return-void
.end method

.method public constructor <init>(Lv4/b0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lv4/b0$a;->c:I

    iget-object v0, p1, Lv4/b0;->b:Lv4/x;

    iput-object v0, p0, Lv4/b0$a;->a:Lv4/x;

    iget-object v0, p1, Lv4/b0;->c:Lv4/v;

    iput-object v0, p0, Lv4/b0$a;->b:Lv4/v;

    iget v0, p1, Lv4/b0;->d:I

    iput v0, p0, Lv4/b0$a;->c:I

    iget-object v0, p1, Lv4/b0;->e:Ljava/lang/String;

    iput-object v0, p0, Lv4/b0$a;->d:Ljava/lang/String;

    iget-object v0, p1, Lv4/b0;->f:Lv4/o;

    iput-object v0, p0, Lv4/b0$a;->e:Lv4/o;

    iget-object v0, p1, Lv4/b0;->g:Lv4/p;

    invoke-virtual {v0}, Lv4/p;->e()Lv4/p$a;

    move-result-object v0

    iput-object v0, p0, Lv4/b0$a;->f:Lv4/p$a;

    iget-object v0, p1, Lv4/b0;->h:Lv4/d0;

    iput-object v0, p0, Lv4/b0$a;->g:Lv4/d0;

    iget-object v0, p1, Lv4/b0;->i:Lv4/b0;

    iput-object v0, p0, Lv4/b0$a;->h:Lv4/b0;

    iget-object v0, p1, Lv4/b0;->j:Lv4/b0;

    iput-object v0, p0, Lv4/b0$a;->i:Lv4/b0;

    iget-object v0, p1, Lv4/b0;->k:Lv4/b0;

    iput-object v0, p0, Lv4/b0$a;->j:Lv4/b0;

    iget-wide v0, p1, Lv4/b0;->l:J

    iput-wide v0, p0, Lv4/b0$a;->k:J

    iget-wide v0, p1, Lv4/b0;->m:J

    iput-wide v0, p0, Lv4/b0$a;->l:J

    iget-object p1, p1, Lv4/b0;->n:Ly4/c;

    iput-object p1, p0, Lv4/b0$a;->m:Ly4/c;

    return-void
.end method

.method public static b(Ljava/lang/String;Lv4/b0;)V
    .locals 1

    iget-object v0, p1, Lv4/b0;->h:Lv4/d0;

    if-nez v0, :cond_3

    iget-object v0, p1, Lv4/b0;->i:Lv4/b0;

    if-nez v0, :cond_2

    iget-object v0, p1, Lv4/b0;->j:Lv4/b0;

    if-nez v0, :cond_1

    iget-object p1, p1, Lv4/b0;->k:Lv4/b0;

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, ".priorResponse != null"

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, ".cacheResponse != null"

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, ".networkResponse != null"

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, ".body != null"

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Lv4/b0;
    .locals 3

    iget-object v0, p0, Lv4/b0$a;->a:Lv4/x;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lv4/b0$a;->b:Lv4/v;

    if-eqz v0, :cond_2

    iget v0, p0, Lv4/b0$a;->c:I

    if-ltz v0, :cond_1

    iget-object v0, p0, Lv4/b0$a;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Lv4/b0;

    invoke-direct {v0, p0}, Lv4/b0;-><init>(Lv4/b0$a;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "message == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "code < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lv4/b0$a;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "protocol == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "request == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
