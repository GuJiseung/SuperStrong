.class public final Ls4/c;
.super Ls4/m0;
.source "SourceFile"


# instance fields
.field public final h:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Ljava/lang/Thread;)V
    .locals 0

    invoke-direct {p0}, Ls4/m0;-><init>()V

    iput-object p1, p0, Ls4/c;->h:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method public final L()Ljava/lang/Thread;
    .locals 1

    iget-object v0, p0, Ls4/c;->h:Ljava/lang/Thread;

    return-object v0
.end method
