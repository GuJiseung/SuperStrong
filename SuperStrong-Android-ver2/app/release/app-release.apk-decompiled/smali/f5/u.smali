.class public final Lf5/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[B

.field public b:I

.field public c:I

.field public d:Z

.field public final e:Z

.field public f:Lf5/u;

.field public g:Lf5/u;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    new-array v0, v0, [B

    iput-object v0, p0, Lf5/u;->a:[B

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf5/u;->e:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf5/u;->d:Z

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/u;->a:[B

    iput p2, p0, Lf5/u;->b:I

    iput p3, p0, Lf5/u;->c:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lf5/u;->d:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lf5/u;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Lf5/u;
    .locals 4
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lf5/u;->f:Lf5/u;

    const/4 v1, 0x0

    if-eq v0, p0, :cond_0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    iget-object v3, p0, Lf5/u;->g:Lf5/u;

    iput-object v0, v3, Lf5/u;->f:Lf5/u;

    iget-object v0, p0, Lf5/u;->f:Lf5/u;

    iput-object v3, v0, Lf5/u;->g:Lf5/u;

    iput-object v1, p0, Lf5/u;->f:Lf5/u;

    iput-object v1, p0, Lf5/u;->g:Lf5/u;

    return-object v2
.end method

.method public final b(Lf5/u;)V
    .locals 1

    iput-object p0, p1, Lf5/u;->g:Lf5/u;

    iget-object v0, p0, Lf5/u;->f:Lf5/u;

    iput-object v0, p1, Lf5/u;->f:Lf5/u;

    iget-object v0, p0, Lf5/u;->f:Lf5/u;

    iput-object p1, v0, Lf5/u;->g:Lf5/u;

    iput-object p1, p0, Lf5/u;->f:Lf5/u;

    return-void
.end method

.method public final c()Lf5/u;
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf5/u;->d:Z

    new-instance v0, Lf5/u;

    iget v1, p0, Lf5/u;->b:I

    iget v2, p0, Lf5/u;->c:I

    iget-object v3, p0, Lf5/u;->a:[B

    invoke-direct {v0, v3, v1, v2}, Lf5/u;-><init>([BII)V

    return-object v0
.end method

.method public final d(Lf5/u;I)V
    .locals 5

    iget-boolean v0, p1, Lf5/u;->e:Z

    if-eqz v0, :cond_3

    iget v0, p1, Lf5/u;->c:I

    add-int v1, v0, p2

    const/16 v2, 0x2000

    iget-object v3, p1, Lf5/u;->a:[B

    if-le v1, v2, :cond_2

    iget-boolean v1, p1, Lf5/u;->d:Z

    if-nez v1, :cond_1

    add-int v1, v0, p2

    iget v4, p1, Lf5/u;->b:I

    sub-int/2addr v1, v4

    if-gt v1, v2, :cond_0

    sub-int/2addr v0, v4

    const/4 v1, 0x0

    invoke-static {v3, v4, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p1, Lf5/u;->c:I

    iget v2, p1, Lf5/u;->b:I

    sub-int/2addr v0, v2

    iput v0, p1, Lf5/u;->c:I

    iput v1, p1, Lf5/u;->b:I

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    iget v0, p0, Lf5/u;->b:I

    iget v1, p1, Lf5/u;->c:I

    iget-object v2, p0, Lf5/u;->a:[B

    invoke-static {v2, v0, v3, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p1, Lf5/u;->c:I

    add-int/2addr v0, p2

    iput v0, p1, Lf5/u;->c:I

    iget p1, p0, Lf5/u;->b:I

    add-int/2addr p1, p2

    iput p1, p0, Lf5/u;->b:I

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
