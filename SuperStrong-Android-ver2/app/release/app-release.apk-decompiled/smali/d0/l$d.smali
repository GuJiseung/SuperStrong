.class public final Ld0/l$d;
.super Ld0/l$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final b:Z


# direct methods
.method public constructor <init>(Ld0/l$a;Z)V
    .locals 0

    invoke-direct {p0, p1}, Ld0/l$c;-><init>(Ld0/l$a;)V

    iput-boolean p2, p0, Ld0/l$d;->b:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Ld0/l$d;->b:Z

    return v0
.end method
