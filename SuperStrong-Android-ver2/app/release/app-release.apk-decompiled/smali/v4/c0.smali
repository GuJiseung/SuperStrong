.class public final Lv4/c0;
.super Lv4/d0;
.source "SourceFile"


# instance fields
.field public final synthetic c:Lv4/s;

.field public final synthetic d:J

.field public final synthetic e:Lf5/g;


# direct methods
.method public constructor <init>(Lv4/s;JLf5/e;)V
    .locals 0

    iput-object p1, p0, Lv4/c0;->c:Lv4/s;

    iput-wide p2, p0, Lv4/c0;->d:J

    iput-object p4, p0, Lv4/c0;->e:Lf5/g;

    invoke-direct {p0}, Lv4/d0;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()J
    .locals 2

    iget-wide v0, p0, Lv4/c0;->d:J

    return-wide v0
.end method

.method public final f()Lv4/s;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lv4/c0;->c:Lv4/s;

    return-object v0
.end method

.method public final h()Lf5/g;
    .locals 1

    iget-object v0, p0, Lv4/c0;->e:Lf5/g;

    return-object v0
.end method
