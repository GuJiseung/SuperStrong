.class public final Lb5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lf5/h;

.field public static final e:Lf5/h;

.field public static final f:Lf5/h;

.field public static final g:Lf5/h;

.field public static final h:Lf5/h;

.field public static final i:Lf5/h;


# instance fields
.field public final a:Lf5/h;

.field public final b:Lf5/h;

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, ":"

    invoke-static {v0}, Lf5/h;->d(Ljava/lang/String;)Lf5/h;

    move-result-object v0

    sput-object v0, Lb5/c;->d:Lf5/h;

    const-string v0, ":status"

    invoke-static {v0}, Lf5/h;->d(Ljava/lang/String;)Lf5/h;

    move-result-object v0

    sput-object v0, Lb5/c;->e:Lf5/h;

    const-string v0, ":method"

    invoke-static {v0}, Lf5/h;->d(Ljava/lang/String;)Lf5/h;

    move-result-object v0

    sput-object v0, Lb5/c;->f:Lf5/h;

    const-string v0, ":path"

    invoke-static {v0}, Lf5/h;->d(Ljava/lang/String;)Lf5/h;

    move-result-object v0

    sput-object v0, Lb5/c;->g:Lf5/h;

    const-string v0, ":scheme"

    invoke-static {v0}, Lf5/h;->d(Ljava/lang/String;)Lf5/h;

    move-result-object v0

    sput-object v0, Lb5/c;->h:Lf5/h;

    const-string v0, ":authority"

    invoke-static {v0}, Lf5/h;->d(Ljava/lang/String;)Lf5/h;

    move-result-object v0

    sput-object v0, Lb5/c;->i:Lf5/h;

    return-void
.end method

.method public constructor <init>(Lf5/h;Lf5/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/c;->a:Lf5/h;

    iput-object p2, p0, Lb5/c;->b:Lf5/h;

    invoke-virtual {p1}, Lf5/h;->j()I

    move-result p1

    add-int/lit8 p1, p1, 0x20

    invoke-virtual {p2}, Lf5/h;->j()I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p0, Lb5/c;->c:I

    return-void
.end method

.method public constructor <init>(Lf5/h;Ljava/lang/String;)V
    .locals 0

    invoke-static {p2}, Lf5/h;->d(Ljava/lang/String;)Lf5/h;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lb5/c;-><init>(Lf5/h;Lf5/h;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lf5/h;->d(Ljava/lang/String;)Lf5/h;

    move-result-object p1

    invoke-static {p2}, Lf5/h;->d(Ljava/lang/String;)Lf5/h;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lb5/c;-><init>(Lf5/h;Lf5/h;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lb5/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lb5/c;

    iget-object v0, p1, Lb5/c;->a:Lf5/h;

    iget-object v2, p0, Lb5/c;->a:Lf5/h;

    invoke-virtual {v2, v0}, Lf5/h;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb5/c;->b:Lf5/h;

    iget-object p1, p1, Lb5/c;->b:Lf5/h;

    invoke-virtual {v0, p1}, Lf5/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lb5/c;->a:Lf5/h;

    invoke-virtual {v0}, Lf5/h;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lb5/c;->b:Lf5/h;

    invoke-virtual {v1}, Lf5/h;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lb5/c;->a:Lf5/h;

    invoke-virtual {v1}, Lf5/h;->m()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lb5/c;->b:Lf5/h;

    invoke-virtual {v1}, Lf5/h;->m()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "%s: %s"

    invoke-static {v1, v0}, Lw4/e;->i(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
