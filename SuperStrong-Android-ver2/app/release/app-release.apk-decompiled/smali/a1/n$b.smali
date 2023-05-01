.class public final La1/n$b;
.super La1/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La1/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:La1/n;


# direct methods
.method public constructor <init>(La1/n;)V
    .locals 0

    invoke-direct {p0}, La1/l;-><init>()V

    iput-object p1, p0, La1/n$b;->a:La1/n;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, La1/n$b;->a:La1/n;

    iget-boolean v1, v0, La1/n;->B:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, La1/i;->I()V

    const/4 v1, 0x1

    iput-boolean v1, v0, La1/n;->B:Z

    :cond_0
    return-void
.end method

.method public final e(La1/i;)V
    .locals 2

    iget-object v0, p0, La1/n$b;->a:La1/n;

    iget v1, v0, La1/n;->A:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, La1/n;->A:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, La1/n;->B:Z

    invoke-virtual {v0}, La1/i;->p()V

    :cond_0
    invoke-virtual {p1, p0}, La1/i;->y(La1/i$d;)V

    return-void
.end method
